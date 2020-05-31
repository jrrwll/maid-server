package org.dreamcat.maid.api.service;

import org.dreamcat.common.web.core.RestBody;
import org.dreamcat.maid.api.controller.file.FileInfoView;
import org.dreamcat.maid.api.controller.file.FileItemView;
import org.dreamcat.maid.api.controller.share.GetShareFileQuery;

import java.util.List;

/**
 * Create by tuke on 2020/5/24
 */
public interface ShareService {

    RestBody<FileInfoView> file(GetShareFileQuery query);

    RestBody<List<FileItemView>> list(GetShareFileQuery query);

    RestBody<String> download(GetShareFileQuery query, boolean attachment);

}